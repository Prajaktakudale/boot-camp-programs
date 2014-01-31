import basic1.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    @Test
    public void checklengthForCentimeter() {
        Length length = new Length(3, new Centimeter());

        assertEquals(3, length.getValue(), 0.1);
        assertEquals(new Centimeter(), length.getUnit());
    }

    @Test
    public void checklengthforMeter() {
        Length length = new Length(3, new Meter());

        assertEquals(3, length.getValue(), 0.1);
        assertEquals(new Meter(), length.getUnit());
    }

    @Test
    public void convertMeterToCentimeter() {
        Length length = new Length(1, new Meter());
        Length lengthInCentimeter = new Length(100, new Centimeter());

        assertEquals(lengthInCentimeter, length.convertTo(new Centimeter()));
    }

    @Test
    public void convertCentimeterToMeter() {
        Length length = new Length(100, new Centimeter());
        Length lengthInMeter = new Length(1, new Meter());
        assertEquals(lengthInMeter, length.convertTo(new Centimeter()));
    }

    @Test
    public void convertMeterToMeter() {
        Length length = new Length(1, new Meter());
        Length lengthInMeter = new Length(1, new Meter());
        assertEquals(lengthInMeter, length.convertTo(new Meter()));
    }

    @Test
    public void convertMeterToMiliMeter() {
        Length length = new Length(1, new Meter());
        Length lengthInMilimeter = new Length(1000, new Milimeter());
        assertEquals(lengthInMilimeter, length.convertTo(new Milimeter()));
    }

    @Test
    public void convertKilometerToMeter() {
        Length length = new Length(1, new Kilometer());
        Length lengthInMeter = new Length(1000, new Meter());
        assertEquals(lengthInMeter, length.convertTo(new Meter()));
    }

    @Test
    public void convertInchToMeter() {
        Length length = new Length(1, new Inch());
        Length lengthInMeter = new Length(0.0254, new Meter());
        assertEquals(lengthInMeter, length.convertTo(new Meter()));
    }

    @Test
    public void convertFeetToCentimeter() {
        Length length = new Length(1, new Feet());
        Length lengthInCentimeter = new Length(30.5, new Centimeter());
        assertEquals(lengthInCentimeter, length.convertTo(new Centimeter()));
    }

    @Test
    public void convertMeterToYard() {
        Length length = new Length(1, new Meter());
        Length lengthInYard = length.convertTo(new Yard());
        assertEquals(length.getValue(), lengthInYard.getValue(), 0.1);
    }

    @Test
    public void convertMileToMeters() {
        Length length1 = new Length(1, new Mile());
        Length length2 = new Length(160934.4, new Centimeter());
        assertEquals(length2, length1.convertTo(new Centimeter()));
    }


}
