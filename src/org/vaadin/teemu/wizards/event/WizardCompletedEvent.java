package org.vaadin.teemu.wizards.event;

import org.vaadin.teemu.wizards.Wizard;

public class WizardCompletedEvent extends AbstractWizardEvent {
    public WizardCompletedEvent(Wizard source) {
        super(source);
    }
}
