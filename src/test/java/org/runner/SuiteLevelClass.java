package org.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testclass.TestingClassCrome;
import org.testclass.TestingClassEdge;

@RunWith(Suite.class)
@SuiteClasses({TestingClassEdge.class,TestingClassCrome.class})
public class SuiteLevelClass {

}
