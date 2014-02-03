import basic1.assignments.Volume;
import basic1.assignments.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenValueIsNegative() {
        new Volume(-10, VolumeUnit.Milliliter);
    }

    @Test
    public void shouldCompareTwoVolumesObjects() {
        Volume volume = new Volume(10000, VolumeUnit.Milliliter);
        Volume volumeInLiter = new Volume(10, VolumeUnit.Liter);
        assertEquals(volumeInLiter, volume);
    }

    @Test
    public void shouldConvertLiterToMilliliter() {
        Volume volume = new Volume(1, VolumeUnit.Liter);
        Volume volumeInMilliliter = volume.convertTo(VolumeUnit.Milliliter);

        assertEquals(1000, volumeInMilliliter.getValue(), 0.1);
    }

    @Test
    public void shouldConvertMilliliterToLiter() {
        Volume volume = new Volume(10000, VolumeUnit.Milliliter);
        Volume volumeInLiter = new Volume(10, VolumeUnit.Liter);
        assertEquals(volumeInLiter, volume.convertTo(VolumeUnit.Milliliter));
    }

    @Test
    public void shouldConvertKiloliterToLiter() {
        Volume volume = new Volume(10, VolumeUnit.Kiloliter);
        Volume volumeInLiter = new Volume(10000, VolumeUnit.Liter);
        assertEquals(volumeInLiter, volume.convertTo(VolumeUnit.Liter));
    }

    @Test
    public void shouldConvertGallonsToLiter() {
        Volume volume = new Volume(1, VolumeUnit.Gallon);
        Volume volumeInLiter = new Volume(3.785,VolumeUnit.Liter);
        assertEquals(volumeInLiter, volume.convertTo(VolumeUnit.Liter));
    }
}
