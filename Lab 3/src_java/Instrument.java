/***********************************************************************
 * Module:  Instrument.java
 * Author:  student
 * Purpose: Defines the Class Instrument
 ***********************************************************************/

import java.util.*;

/** @pdOid 3d38bdc8-548d-4fb7-bd3a-2447b1f7c349 */
public abstract class Instrument {
   /** @pdOid c0f3024b-63b6-481f-a58f-78b5256112a0 */
   private int instrumentCategory;
   /** @pdOid 18aca53f-4f76-44fb-99aa-3b827a7d3409 */
   private int instrumentID;
   /** @pdOid 1ddb56b5-ed09-4bae-ba4c-7daafa3a741e */
   private Sensor[] sensors;
   
   /** @pdRoleInfo migr=no name=TransEquipment assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public TransEquipment transEquipment;
   /** @pdRoleInfo migr=no name=Sensor assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=0..4 */
   public java.util.Collection<Sensor> sensor;
   
   /** @pdOid 31c2707c-0501-4529-8867-3e2174c9ea65 */
   public String getTime() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 23fa38ab-6211-4c1a-a893-0206d263599c */
   public String readSensor() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e22259c7-8d15-44a6-820e-c2793f8d9100 */
   public void saveData() {
      // TODO: implement
   }
   
   /** @param serverID 
    * @param account 
    * @param password 
    * @param strData 
    * @param strTime
    * @pdOid 13fd7777-1996-4d86-bdc4-3dbdc253a1fd */
   public void senData(String serverID, String account, String password, String strData, String strTime) {
      // TODO: implement
   }
   
   /** @pdOid 58ce6a28-7ff3-4c8a-a66e-53472ff337f1 */
   public void Loop() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Sensor> getSensor() {
      if (sensor == null)
         sensor = new java.util.HashSet<Sensor>();
      return sensor;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSensor() {
      if (sensor == null)
         sensor = new java.util.HashSet<Sensor>();
      return sensor.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSensor */
   public void setSensor(java.util.Collection<Sensor> newSensor) {
      removeAllSensor();
      for (java.util.Iterator iter = newSensor.iterator(); iter.hasNext();)
         addSensor((Sensor)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSensor */
   public void addSensor(Sensor newSensor) {
      if (newSensor == null)
         return;
      if (this.sensor == null)
         this.sensor = new java.util.HashSet<Sensor>();
      if (!this.sensor.contains(newSensor))
      {
         this.sensor.add(newSensor);
         newSensor.setInstrument(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSensor */
   public void removeSensor(Sensor oldSensor) {
      if (oldSensor == null)
         return;
      if (this.sensor != null)
         if (this.sensor.contains(oldSensor))
         {
            this.sensor.remove(oldSensor);
            oldSensor.setInstrument((Instrument)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSensor() {
      if (sensor != null)
      {
         Sensor oldSensor;
         for (java.util.Iterator iter = getIteratorSensor(); iter.hasNext();)
         {
            oldSensor = (Sensor)iter.next();
            iter.remove();
            oldSensor.setInstrument((Instrument)null);
         }
      }
   }

}