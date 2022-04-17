import java.text.SimpleDateFormat;
import java.util.Date;
 */
public class Appointment {
  // instance variables - replace the example below with your own
  private int duration;
  private SimpleDateFormat form = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
  private Date date;
  private Date end;
  private String name;
  /**
   * Constructor for objects of class Appointment.
   */
  public Appointment(String dat) {
    // initialise instance variables
    date = new Date();
    end = new Date();
    try {
      date = form.parse(dat);
    } catch (Exception e) {
      System.out.println();  
    }
    this.duration = 30;
    endSlotCal(date);
    name = "";
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  private void endSlotCal(Date dte) {
    long min = dte.getTime();
    end.setTime(min + (duration * 60 * 1000));
    //System.out.println(end);
  }
  
  public Date getDat() {
    return date;
  }
  
  public Date getEnd() {
    return end;
  }
  
  /**
   * @return it returns time and duration of slot. 
   */
  public String toString() {
    String str = "";
    str = str + form.format(date) + " - " + duration;
    return str;
  }
}