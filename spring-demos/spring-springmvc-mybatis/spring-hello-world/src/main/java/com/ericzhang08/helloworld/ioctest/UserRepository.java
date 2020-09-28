package com.ericzhang08.helloworld.ioctest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "prototype")
public class UserRepository {
}
