package com.company.mailservices;

import com.company.interfaces.MailService;
import com.company.interfaces.Sendable;
import com.company.messages.MailMessage;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Spy implements MailService {

    public static final String AUSTIN_POWERS = "Austin Powers";
    private Logger LOGGER;

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage mailMessage = (MailMessage) mail;
            if (mail.getFrom().equals(AUSTIN_POWERS) | mail.getTo().equals(AUSTIN_POWERS)) {
                this.LOGGER.log(Level.WARNING,
                    "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                    new Object[]{mail.getFrom(), mail.getTo(), mailMessage.getMessage()});
            } else {
                this.LOGGER.log(Level.INFO,
                    "Usual correspondence: from {0} to {1}",
                    new Object[]{mail.getFrom(), mail.getTo()});
            }
        }
        return mail;
    }
}

