#!/bin/bash

readonly PROGNAME=$(basename $0)
readonly PROGDIR=$(dirname $0)
readonly ARGS="$@"

usage() {
    cat <<- EOF
    usage: $PROGNAME options

    Program deletes files from filesystems to release space.
    It gets config file that define fileystem paths to work on, and whitelist rules to
    keep certain files.

    OPTIONS:
       -c --config              configuration file containing the rules. use --help-config to see the syntax.
       -n --pretend             do not really delete, just how what you are going to do.
       -t --test                run unit test to check the program
       -v --verbose             Verbose. You can specify more then one -v to 2have more verbose
       -x --debug               debug
       -h --help                show this help
          --help-config         configuration help


    Examples:
       Run all tests:
       $PROGNAME --test all

       Run specific test:
       $PROGNAME --test test_string.sh

       Run:
       $PROGNAME --config /path/to/config/$PROGNAME.conf

       Just show what you are going to do:
       $PROGNAME -vn -c /path/to/config/$PROGNAME.conf
EOF
}

usage_config(){
    cat <<- EOF
    usage: $PROGNAME options
EOF
}


cmdline() {
    # got this idea from here:
    # http://kirk.webfinish.com/2009/10/bash-shell-script-to-use-getopts-with-gnu-style-long-positional-parameters/
    local arg=
    for arg
    do
        local delim=""
        case "$arg" in
            #translate --gnu-long-options to -g (short options)
            --config)         args="${args}-c ";;
            --pretend)        args="${args}-n ";;
            --test)           args="${args}-t ";;
            --help)           args="${args}-h ";;
            --help-config)    usage_config && exit 0;;
            --verbose)        args="${args}-v ";;
            --debug)          args="${args}-x ";;
            #pass through anything else
            *) [[ "${arg:0:1}" == "-" ]] || delim="\""
                args="${args}${delim}${arg}${delim} ";;
        esac
    done

    #Reset the positional parameters to the short options
    #set doc: http://linuxcommand.org/lc3_man_pages/seth.html
    eval set -- ${args}


    while getopts "nvhxt:c:" OPTION
    do
        echo option $OPTION
         case $OPTION in
         v)
             readonly VERBOSE=1
             echo 234
             ;;
         h)
             usage
             exit 0
             ;;
         x)
             readonly DEBUG='-x'
             set -x
             ;;
         t)
             RUN_TESTS=$OPTARG
             verbose VINFO "Running tests"
             ;;
         c)
             readonly CONFIG_FILE=$OPTARG
             ;;
         n)
             readonly PRETEND=1
             ;;

        esac
    done
#     some validate to check input is right
        [[ ! -f $CONFIG_FILE ]] \
            && echo "You must provide --config file, see usage for more information" \
            && usage \
            && exit 1

    return 0
}

main() {
    cmdline ${ARGS}
}

main

