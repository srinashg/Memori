public class Reminder {
    private String message;
    private int frequency; // in minutes
    private String deliveryMethod; // text, email, sound

    public Reminder(String message, int frequency, String deliveryMethod) {
        this.message = message;
        this.frequency = frequency;
        this.deliveryMethod = deliveryMethod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void sendReminder() {
        // code to send the reminder message using the specified delivery method
        // and repeat at the specified frequency
    }
}
