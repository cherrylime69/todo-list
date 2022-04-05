package com.test

interface Test1 {

    val title: String
    val status: String

}

interface Test2 {

    val title: String
    val status: String

}

class Test10 : Test1, Test2 {

    override val title = "Test 11입니다"
    override val status = "Test  11입니다"

}


class Test20 : Test1, Test2 {

    override val title = "Test 22 입니다"
    override val status = "Test 22 입니다"

}


