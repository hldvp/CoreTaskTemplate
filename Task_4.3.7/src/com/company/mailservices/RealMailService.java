/*
Класс, в котором скрыта логика настоящей почты
*/

package com.company.mailservices;

import com.company.interfaces.MailService;
import com.company.interfaces.Sendable;

public class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
        return mail;
    }
}
