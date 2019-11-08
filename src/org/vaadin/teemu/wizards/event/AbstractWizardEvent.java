package org.vaadin.teemu.wizards.event;

import com.vaadin.ui.Component;
import org.vaadin.teemu.wizards.Wizard;

public class AbstractWizardEvent extends Component.Event {

    protected AbstractWizardEvent(Wizard source) {
        super(source);
    }

    /**
     * Returns the {@link Wizard} component that was the source of this event.
     * 
     * @return the source {@link Wizard} of this event.
     */
    public Wizard getWizard() {
        return (Wizard) getSource();
    }
}
