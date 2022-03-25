package structural.decorator;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ChristmasTreeTest {
    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        assertEquals(
            "Christmas tree with Bubble Lights",tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(
            new BubbleLights(new BubbleLights(new ChristmasTreeImpl())));
        assertEquals(
            "Christmas tree with Bubble Lights with Bubble Lights with Bubble Lights",tree2.decorate());
    }
}
