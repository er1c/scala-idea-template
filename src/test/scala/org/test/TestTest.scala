package org.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class TestTest extends FunSuite with ShouldMatchers {
  test("Test.foo") {
    Test.foo should equal ("bar")
  }
}