package ex21_Abstraction;

public class Lab190_Interview_q {
}

interface I11{}
interface I12{}

class A1{}
class B1{}

//class test1 extends A1, B1{}
class test2 extends A1{}

class test3 implements I11{}
class test4 implements I11, I12{}
class test5 extends A1 implements I11, I12{}
//class test6 implements I11 extends A{}

