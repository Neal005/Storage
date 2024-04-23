/***********************************************************************
 * Module:  Sensor.java
 * Author:  student
 * Purpose: Defines the Class Sensor
 ***********************************************************************/

import java.util.*;

/** @pdOid 48223589-9b13-49da-8a48-f7bada0f1857 */
public abstract class Sensor {
   /** @pdOid 42b5632e-c563-41a7-9d0f-4442bdf364c7 */
   private int sensorCategory;
   /** @pdOid 3a1a413e-e0e1-4f65-83a5-5c652d2da369 */
   private int sensorID;
   
   /** @pdRoleInfo migr=no name=Instrument assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Instrument instrument;
   
   /** @pdOid 83e1aee2-5f4f-40ad-ac7a-9650cf9d1574 */
   public float getIndicator() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default parent getter */
   public Instrument getInstrument() {
      return instrument;
   }
   
   /** @pdGenerated default parent setter
     * @param newInstrument */
   public void setInstrument(Instrument newInstrument) {
      if (this.instrument == null || !this.instrument.equals(newInstrument))
      {
         if (this.instrument != null)
         {
            Instrument oldInstrument = this.instrument;
            this.instrument = null;
            oldInstrument.removeSensor(this);
         }
         if (newInstrument != null)
         {
            this.instrument = newInstrument;
            this.instrument.addSensor(this);
         }
      }
   }

}