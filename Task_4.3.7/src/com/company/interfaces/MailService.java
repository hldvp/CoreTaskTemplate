/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/

package com.company.interfaces;

public interface MailService {
    Sendable processMail(Sendable mail);

}
