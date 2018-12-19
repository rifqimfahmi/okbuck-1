package com.uber.okbuck.example.empty;

import static org.junit.Assert.assertEquals;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 27, packageName = "com.uber.okbuck.example.empty")
public class EmptyLibraryUnitTest {

  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }

  @Test
  public void resource_loading() {
    assertEquals(
        RuntimeEnvironment.application.getResources().getString(R.string.empty_release_string),
        "empty_release_string");
  }

  @Test
  public void test_uuid() {
    System.out.println(UUID.randomUUID().toString());
    assertEquals(1, 1);
  }

  @Test
  public void test_uuid_again() {
    System.out.println(UUID.randomUUID().toString());
    assertEquals(1, 1);
  }

  @Test
  public void test_cipherDES() throws NoSuchPaddingException, NoSuchAlgorithmException {
    Cipher cipher = Cipher.getInstance("DES"); // /CBC/PKCS5Padding
    System.out.println(cipher);
    assertEquals(1, 1);
  }
}
