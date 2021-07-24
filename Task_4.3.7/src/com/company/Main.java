package com.company;

import com.company.interfaces.MailService;
import com.company.interfaces.Sendable;
import com.company.mailservices.Inspector;
import com.company.mailservices.Spy;
import com.company.mailservices.Thief;
import com.company.mailservices.UntrustworthyMailWorker;
import com.company.messages.MailMessage;
import com.company.messages.MailPackage;
import com.company.messages.Package;
import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(Main.class.getName());
        MailPackage mailPackage = new MailPackage(AUSTIN_POWERS, "Polina",
            new Package("Hello!", 10));
        MailMessage mailMessage = new MailMessage(AUSTIN_POWERS, "Polina", "I love you");
        MailMessage mailMessage1 = new MailMessage("Ilya", "Polina", "I love you");
        MailPackage mailPackage1 = new MailPackage("Nikita","kiril",
            new Package("stones",3));
        MailPackage mailPackage2 = new MailPackage("Nikita","kiril",
            new Package("weapons",7));
        Inspector inspector = new Inspector();
        Spy spy = new Spy(LOGGER);
        Thief thief = new Thief(7);
        MailService[] mailService = new MailService[] {
            spy, thief, inspector
        };
        Sendable[] sendable = new Sendable[] {
            mailMessage, mailMessage1
//            , mailPackage, mailPackage1, mailPackage2
        };
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(mailService);
        for (Sendable send : sendable) {
            System.out.println();
            worker.processMail(send);
            System.out.println();
        }

    }
}
