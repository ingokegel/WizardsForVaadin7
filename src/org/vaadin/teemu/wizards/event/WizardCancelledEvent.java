package org.vaadin.teemu.wizards.event;

import org.vaadin.teemu.wizards.Wizard;

public class WizardCancelledEvent extends AbstractWizardEvent {
    public WizardCancelledEvent(Wizard source) {
        super(source);
    }
}
