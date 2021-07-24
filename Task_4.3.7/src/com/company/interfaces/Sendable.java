/*
Интерфейс: сущность, которую можно отправить по почте.
У такой сущности можно получить от кого и кому направляется письмо.
*/

package com.company.interfaces;

public interface Sendable {
    String getFrom();
    String getTo();
}
