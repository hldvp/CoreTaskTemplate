package com.company.mailservices;

import com.company.IllegalPackageException;
import com.company.StolenPackageException;
import com.company.interfaces.MailService;
import com.company.interfaces.Sendable;
import com.company.messages.MailPackage;

public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent().contains(WEAPONS) | mailPackage.getContent()
                .getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (mailPackage.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
