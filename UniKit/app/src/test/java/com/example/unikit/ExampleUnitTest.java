package com.example.unikit;



import kotlin.Metadata;
import org.junit.Assert;
import org.junit.Test;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"},
        d2 = {"Lcom/example/unikit/ExampleUnitTest;", "", "()V", "addition_isCorrect", "", "app_debug"}
)
public final class ExampleUnitTest {

   @Test
   public final void addition_isCorrect() {
      Assert.assertEquals(4L, 4L);
   }
}
