/***********************************************************************
 * Module:  TransEquipment.java
 * Author:  student
 * Purpose: Defines the Class TransEquipment
 ***********************************************************************/

import java.util.*;

/** @pdOid 55ba560a-6e88-4eea-87ce-20e7d33dce0c */
public abstract class TransEquipment {
   /** @pdOid de633234-ec40-48d9-b283-c1f3834e197c */
   private int transCategory;
   /** @pdOid ef0c32cb-9505-4378-9d19-6e6335eb9ad6 */
   private int transID;
   
   /** @pdRoleInfo migr=no name=Instrument assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Instrument instrument;
   
   /** @param str
    * @pdOid cd19f452-3417-40a8-9bb9-638abd65e368 */
   public int send(String str) {
      // TODO: implement
      return 0;
   }

}