import basic1.assignments.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenLengthIsNegative() {
        new Length(-3, LengthUnit.Meter);
    }

    @Test
    public void shouldConvertMeterToCentimeter() {
        Length length = new Length(1, LengthUnit.Meter);
        Length lengthInCentimeter = length.convertTo(LengthUnit.Centimeter);

        assertEquals(100, lengthInCentimeter.getValue(),0.1);
    }

    @Test
    public void shouldCompareTwoLengthObject() {
        Length length = new Length(1, LengthUnit.Meter);
        Length lengthInCentimeter = new Length(100, LengthUnit.Centimeter);

        assertEquals(lengthInCentimeter, length);
    }

    @Test
    public void convertCentimeterToMeter() {
        Length length = new Length(100, LengthUnit.Centimeter);
        Length lengthInMeter = new Length(1, LengthUnit.Meter);
        assertEquals(lengthInMeter, length.convertTo(LengthUnit.Centimeter));
    }

    @Test
    public void convertMeterToMeter() {
        Length length = new Length(1, LengthUnit.Meter);
        Length lengthInMeter = new Length(1, LengthUnit.Meter);
        assertEquals(lengthInMeter, length.convertTo(LengthUnit.Meter));
    }

    @Test
    public void convertMeterToMiliMeter() {
        Length length = new Length(1, LengthUnit.Meter);
        Length lengthInMilimeter = new Length(1000, LengthUnit.Millimeter);
        assertEquals(lengthInMilimeter, length.convertTo(LengthUnit.Millimeter));
    }

    @Test
    public void convertKilometerToMeter() {
        Length length = new Length(1, LengthUnit.Kilometer);
        Length lengthInMeter = new Length(1000, LengthUnit.Meter);
        assertEquals(lengthInMeter, length.convertTo(LengthUnit.Meter));
    }

    @Test
    public void convertInchToMeter() {
        Length length = new Length(1, LengthUnit.Inch);
        Length lengthInMeter = new Length(0.0254, LengthUnit.Meter);
        assertEquals(lengthInMeter, length.convertTo(LengthUnit.Meter));
    }

    @Test
    public void convertFeetToCentimeter() {
        Length length = new Length(1, LengthUnit.Feet);
        Length lengthInCentimeter = new Length(30.5, LengthUnit.Centimeter);
        assertEquals(lengthInCentimeter, length.convertTo(LengthUnit.Centimeter));
    }

    @Test
    public void convertMeterToYard() {
        Length length = new Length(1, LengthUnit.Meter);
        Length lengthInYard = length.convertTo(LengthUnit.Yard);
        assertEquals(length.getValue(), lengthInYard.getValue(), 0.1);
    }

    @Test
    public void convertMileToMeters() {
        Length length1 = new Length(1, LengthUnit.Meter);
        Length length2 = new Length(160934.4, LengthUnit.Centimeter);
        assertEquals(length2, length1.convertTo(LengthUnit.Centimeter));
}
}
