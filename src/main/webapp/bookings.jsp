<%-- 
    Document   : bookings
    Created on : Jul 24, 2023, 3:48:33 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Vehicle Repairment Booking</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4 pb-4">Book your Vehicle appointment</h1>
                            </div>
                            <form class="user" action="SvBookings" method="POST">
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="customerFName"
                                        name="first_Name" placeholder="Customer First Name" required>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="customerLName"
                                        name="last_Name" placeholder="Customer Last Name" required>
                                </div>
                                <div class="form-group">
                                    <input type="tel" class="form-control form-control-user" id="mobilePhone"
                                        name="mobile_number" placeholder="Mobile Phone (essential)" required>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="vehicleType"
                                        name="vehicle_Type" placeholder="Vehicle Type" required>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="vehicleMake"
                                        name="vehicle_Make" placeholder="Vehicle Make" required>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="vehicleLicense"
                                        name="vehicle_Licence" placeholder="Vehicle License Details" required>
                                </div>
                                <div class="form-group">
                                    <label for="engineType">Choose Engine Type:</label>
                                    <select class="form-control form-control-user" id="engineType" name="engineType" required>
                                        <option value="" disabled selected>Select an option</option>
                                        <option value="diesel">Diesel</option>
                                        <option value="petrol">Petrol</option>
                                        <option value="hybrid">Hybrid</option>
                                        <option value="electric">Electric</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="bookingType">Choose Booking type:</label>
                                    <select class="form-control form-control-user" id="bookingType" name="bookingType" required>
                                        <option value="" disabled selected>Select an option</option>
                                        <option value="annualService">Annual Service</option>
                                        <option value="majorService">Major Service</option>
                                        <option value="repair">Repair / Fault</option>
                                        <option value="majorRepair">Major Repair</option>
                                    </select>
                                </div>

                                <div class="selected-options">
                                    <p>Selected Engine Type: <span id="selectedEngineType"></span></p>
                                    <p>Selected Booking Required: <span id="selectedBookingRequired"></span></p>
                                </div>
                                <div class="form-group">
                                    <label for="bookingDate">Select Booking Date:</label>
                                    <input type="date" class="form-control form-control-user" id="bookingDate" name="date" required>
                                </div>
                                <div class="form-group">
                                    <textarea class="form-control form-control-user" id="customerComments"
                                        name="comments" placeholder="Customer Comments (optional)"></textarea>
                                </div>
                                <button type="submit" class="btn btn-primary btn-user btn-block">
                                    Book date
                                </button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Script to disable Sundays in the date picker -->
    <script>
        //User can choose any day of the week except Sundays
        const bookingDateInput = document.getElementById('bookingDate');

        bookingDateInput.addEventListener('input', function () {
            const selectedDate = new Date(this.value);
            if (selectedDate.getDay() === 0) { // Sunday (0)
                this.setCustomValidity('Garage is closed on Sundays. Please choose another date.');
            } else {
                this.setCustomValidity('');
            }
        });
        //Displaying customer options for engine and booking type.
        const engineTypeSelect = document.getElementById('engineType');
        const bookingTypeSelect = document.getElementById('bookingType');
        const selectedEngineType = document.getElementById('selectedEngineType');
        const selectedBookingRequired = document.getElementById('selectedBookingRequired');

        engineTypeSelect.addEventListener('change', function () {
            selectedEngineType.textContent = this.value;
        });

        bookingTypeSelect.addEventListener('change', function () {
            selectedBookingRequired.textContent = this.value;
        });

          
    </script>
    
    

</body>

</html>
