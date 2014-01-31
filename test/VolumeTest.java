import org.junit.Test;
import volumeAssignment.*;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void shouldGiveVolumeForMililiter() {
        Volume volume = new Volume(10, new Mililiter());
        assertEquals(10, volume.getValue(), 0.1);
        assertEquals(new Mililiter(), volume.getUnit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenValueIsNegative() {
        new Volume(-10, new Mililiter());
    }

    @Test
    public void shouldConvertLiterToMilileter() {
        Volume volume = new Volume(1, new Liter());
        Quantity volumeInMililiter = volume.convertTo(new Mililiter());

        assertEquals(1000, volumeInMililiter.getValue(), 0.1);
    }

    @Test
    public void shouldConvertMililiterToLiter() {
        Volume volume = new Volume(10000, new Mililiter());
        Quantity volumeInLiter = new Quantity(10,new Liter());
        assertEquals(volumeInLiter,volume.convertTo(new Liter()));
    }

    @Test
    public void shouldConvertKiloliterToLiter() {
        Volume volume = new Volume(10, new KiloLiter());
        Quantity volumeInLiter = new Quantity(10000,new Liter());
        assertEquals(volumeInLiter,volume.convertTo(new Liter()));
    }


    @Test
    public void shouldConvertGallonsToLiter() {
        Volume volume = new Volume(1, new Gallons());
        Quantity volumeInLiter = new Quantity(3.785,new Liter());
        assertEquals(volumeInLiter,volume.convertTo(new Liter()));
    }


}
