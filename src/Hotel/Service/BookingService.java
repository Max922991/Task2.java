package Hotel.Service;

import Hotel.entiti.Bill;
import Hotel.entiti.Client;
import Hotel.entiti.Hotel;
import Hotel.entiti.Room;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson){

        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for(Room r : rooms){
            if(r.isFree()){
                isFreeRooms = true;
            }
        }
        if(!isFreeRooms){
            System.out.println("Свободных номеров в отеле: " + hotel.getName() + " нет!");
        }
        boolean success = false;
        String clientName = client.getName();
        for(Room room : rooms){
            if(room.getNumberOfPerson() == numberOfPerson){
                success = true;
                System.out.println("Нашёлся номер для пользователя: " + clientName);
                if(client.getBill().getAmount() >= room.getCost()){
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом: " + clientName);
                }else {
                    System.out.println("На Вашем счёте недостаточно средств: " + clientName);
                }
            }
        }
        if(!success){
            System.out.println("Не нашлось подходящего номера для клиента: " + clientName);
        }
    }
}
