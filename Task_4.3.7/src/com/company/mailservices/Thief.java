package com.company.mailservices;

import com.company.interfaces.MailService;
import com.company.interfaces.Sendable;
import com.company.messages.MailPackage;
import com.company.messages.Package;

public class Thief implements MailService {

    private int minPrice;
    private int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    private void updateStolenValue(int value) {
        this.stolenValue = this.stolenValue + value;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (minPrice <= mailPackage.getContent().getPrice()) {
                updateStolenValue(mailPackage.getContent().getPrice());
                String s = mailPackage.getContent().getContent();
                MailPackage result = new MailPackage(mailPackage.getFrom(),
                    mailPackage.getTo(),
                    new Package("stones instead of ".concat(mailPackage.getContent().getContent()),
                        0));
                return result;
            }
        }
        return mail;
    }
}
