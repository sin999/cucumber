# language: ru
@withdrawal
Функция: Снятие денег со счета

  @success
  Структура сценария: Успешное снятие денег со счета
    Дано на счете пользователя имеется <изначально> рублей
    Когда пользователь снимает со счета <снято> рублей
    Тогда на счете пользователя имеется <осталось> рублей

    Примеры:
      | изначально | снято | осталось |
      | 10000      | 1     | 9999     |
      | 9999       | 9999  | 0        |