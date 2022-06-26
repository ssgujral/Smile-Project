package com.example.smileproject.Smile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class SmileTest {

  @Test
  void testInitializedValues() {
    Smile big_smile = new Smile(2, false, false);

    assertEquals(2, big_smile.getId());

    assertEquals(false, big_smile.isCrying());

    assertEquals(false, big_smile.isLaughing());
  }
}
