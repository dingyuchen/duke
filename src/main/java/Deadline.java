import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline extends Task {
    private Date by;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HHmm");

    Deadline(String description, String by) throws ParseException {
        super(description);
        this.by = this.formatter.parse(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
