package seedu.address.commons.events.ui;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.person.Person;

/**
 * Event to handle info change in the case of edit
 */

public class PersonSelectionChangedEvent extends BaseEvent {

    private final Person newSelection;

    public PersonSelectionChangedEvent(Person newSelection) {
        this.newSelection = newSelection;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public Person getNewSelection() {
        return newSelection;
    }
}

