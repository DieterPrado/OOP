from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car.driver), vars(car))

    car2 = Car("ARS456", Account("Andrea Herrera", "AND875"))
    print(vars(car2.driver))