package seedu.address.logic.commands;

import seedu.address.model.event.*;

public class EventsCommand extends Command {
    public static final String COMMAND_WORD = "events";
    public static final String COMMAND_ALIAS = "ev";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Lists all events for the next month\n"
            + "Example: " + COMMAND_WORD;

    private final EventPredicate predicate = new EventPredicate();

    public EventsCommand( ) { }

    @Override
    public CommandResult execute() {
        model.updateFilteredEventList(predicate);
        return new CommandResult(getEventsMessageSummary(model.getFilteredEventList().size()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof EventsCommand // instanceof handles nulls
                && this.predicate.equals(((EventsCommand) other).predicate)); // state check
    }
}


