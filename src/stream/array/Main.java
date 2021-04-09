package stream.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        String MESSAGE_STATUS_NOTFILLED = "notfilled";
        String MESSAGE_STATUS_TOSEND = "tosend";

        Set<String> MSG_STAT_DRAFT_TOSEND = new HashSet<>();
        MSG_STAT_DRAFT_TOSEND.add("notfilled");
        MSG_STAT_DRAFT_TOSEND.add("tosend");
        List<String> selectedMessages = new ArrayList<>();
        selectedMessages.add("notfilled");
        selectedMessages.add("tosend");

        boolean dd =  selectedMessages.stream()
                .allMatch(m -> MSG_STAT_DRAFT_TOSEND.contains("test"));

        boolean asdf =  MSG_STAT_DRAFT_TOSEND.contains("tosend");
    }
}
