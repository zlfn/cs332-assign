package recfun

import org.scalatest.funsuite.AnyFunSuite

class PascalSuite extends AnyFunSuite {
  import Main.pascal
  test("pascal: col=0,row=2") {
    assert(pascal.exec(0,2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal.exec(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal.exec(1,3) === 3)
  }

  test("pascal: col=-1, row=-1") {
    assertThrows[RuntimeException](pascal.exec(-1, -1))
  }
}
