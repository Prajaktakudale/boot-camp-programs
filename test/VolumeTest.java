import basic1.assignments.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenValueIsNegative() {
        new Volume(-10, new Milliliter());
    }

    @Test
    public void shouldCompareTwoVolumesObjects() {
        Volume volume = new Volume(10000, new Milliliter());
        Volume volumeInLiter = new Volume(10, new Liter());
        assertEquals(volumeInLiter, volume);
    }

    @Test
    public void shouldConvertLiterToMilliliter() {
        Volume volume = new Volume(1, new Liter());
        Volume volumeInMilliliter = volume.convertTo(new Milliliter());

        assertEquals(1000, volumeInMilliliter.getValue(), 0.1);
    }

    @Test
    public void shouldConvertMilliliterToLiter() {
        Volume volume = new Volume(10000, new Milliliter());
        Volume volumeInLiter = new Volume(10, new Liter());
        assertEquals(volumeInLiter, volume.convertTo(new Milliliter()));
    }

    @Test
    public void shouldConvertKiloliterToLiter() {
        Volume volume = new Volume(10, new KiloLiter());
        Volume volumeInLiter = new Volume(10000, new Liter());
        assertEquals(volumeInLiter, volume.convertTo(new Liter()));
    }

    @Test
    public void shouldConvertGallonsToLiter() {
        Volume volume = new Volume(1, new Gallons());
        Volume volumeInLiter = new Volume(3.785, new Liter());
        assertEquals(volumeInLiter, volume.convertTo(new Liter()));
    }
}
