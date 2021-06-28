<?php
require_once('car.php');
require_once('uberX.php');
require_once('Account.php');
}

$uberX = new UberX("CVB213", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
uberX->printDataCar();
?>