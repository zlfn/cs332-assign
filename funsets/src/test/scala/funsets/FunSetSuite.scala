package funsets

import org.scalatest.funsuite.AnyFunSuite

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
class FunSetSuite extends AnyFunSuite {


  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  
  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }
  
  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   * 
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   * 
   *   val s1 = singletonSet(1)
   * 
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   * 
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   * 
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   * 
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  /**
   * We create a new instance of the "TestSets" trait, this gives us access
   * to the values "s1" to "s3". 
   */

  test("singleton") {
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton 1")
      assert(contains(s2, 2), "Singleton 2")
      assert(contains(s3, 3), "Singleton 3")
    }
  }

  test("union") {
    new TestSets {
      val s = union(s1, s2)
      val v = union(s1, s2, s3)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
      assert(contains(v, 1), "Union 4")
      assert(contains(v, 2), "Union 5")
      assert(contains(v, 3), "Union 6")
    }
  }

  test("intersect") {
    new TestSets {
      val s = union(s1, s2)
      val v = intersect(s1, s)
      assert(contains(v, 1), "Intersect 1")
      assert(!contains(v, 2), "Intersect 2")
      assert(!contains(v, 3), "Intersect 2")
    }
  }

  test("diff") {
    new TestSets {
      val v1 = union(s1, s2)
      val v2 = union(s2, s3)
      val t = diff(s1, s2)
      assert(contains(t, 1), "Diff 1")
      assert(!contains(t, 2), "Diff 2")
      assert(!contains(t, 3), "Diff 3")
    }
  }

  test("filter") {
    new TestSets {
      val v1 = filter(s1, _=>true)
      val v2 = filter(s2, _=>false)
      assert(contains(v1, 1), "Filter 1")
      assert(!contains(v2, 2), "Filter 1")
    }
  }

  test("forall") {
    new TestSets {
      val v = union(s1, s2, s3)
      assert(forall(v, _=>true), "Forall 1")
      assert(!forall(v, _=>false), "Forall 2")
      assert(forall(v, x=>x*x>0), "Forall 3")
      assert(!forall(v, x=>x<2), "Forall 4")
    }
  }

  test("exist") {
    new TestSets {
      val v = union(s1, s2, s3)
      assert(exists(v, _=>true), "Exist 1")
      assert(!exists(v, _=>false), "Exist 2")
      assert(!exists(v, x=>x*x<0), "Exist 3")
      assert(exists(v, x=>x<2), "Exist 4")
    }
  }

  test("map") {
    new TestSets {
      val s = map(union(s1, s2, s3), x=>2*x)
      printSet(s)
      assert(contains(s, 2), "Map 1")
      assert(contains(s, 4), "Map 2")
      assert(contains(s, 6), "Map 3")
      assert(!contains(s, 1), "Map 4")
      }
  }
}
