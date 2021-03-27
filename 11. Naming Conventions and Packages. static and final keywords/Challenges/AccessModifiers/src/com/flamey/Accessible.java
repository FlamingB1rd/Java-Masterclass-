package com.flamey;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the in variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering

interface Accessible //private-package => onlyin package com.flamey
{
    int SOME_CONSTANT = 100; //public => in Interfaces by default fields are set to public static final
    public void methodA(); //public
    void methodB(); //public => in Interfaces all methods are, by default, set to public
    boolean methodC(); //public
}