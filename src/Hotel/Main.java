package Hotel;

import Hotel.Service.BookingService;
import Hotel.entiti.Bill;
import Hotel.entiti.Client;
import Hotel.entiti.Hotel;
import Hotel.entiti.Room;

/**
 * В данном домашнем задании нужно написать систему бронировния номеров в отеле.
 * Сущности: Client, Hotel, Room, Bill.
 *
 * Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
 * В Bill будет сумма денег
 * Hotel будет содеражть поля: имя отеля, список номеров
 * Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер
 *
 * Сценарии:
 * Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
 * несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 * Клиент должен попробовать забронировать номер, для этого он так же указывает
 * сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 *
 * Так же при бронировании проверять есть ли свободные номера
 *
 * В одном из сценариев, клиенту должно не хватить денег для бронирования номера
 *
 * В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов
 */

public class Main {
    public static void main(String[] args) {

        Bill LoriBill = new Bill(10000);
        Client LoriClient = new Client("Lori", "Cat", "+123456", "lori@cat.xyz", LoriBill);

        Bill baxBill = new Bill(12000);
        Client baxClient = new Client("Bax", "Cat", "+2356854", "bax@cat.xyz", baxBill);

        Room[] californiaHotelRooms = new Room[]{new Room(1, 1500, true),
        new Room(3, 3500, true), new Room(2, 2500, true)};

        Hotel californiaHotel = new Hotel("california", californiaHotelRooms);

        Room[] sanFrancisco = new Room[]{new Room(2, 2800, true),
                new Room(3, 14000, true), new Room(1, 2000, true)};

        Hotel sanFranciscoHotel = new Hotel("sanFrancisco", sanFrancisco);

        BookingService bookingService = new BookingService();

        bookingService.book(californiaHotel, LoriClient, 2);
        System.out.println("\n");
        bookingService.book(californiaHotel, LoriClient, 4);
        bookingService.book(sanFranciscoHotel, baxClient, 3);







    }
}
