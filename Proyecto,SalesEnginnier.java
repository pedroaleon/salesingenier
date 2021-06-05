npm install --save jwt-simple
// Create Token ///
'use strict' 'crete createtoken'

const mongoose = requiere ('mongoose')
const user = requiere ('../models/user')
const jwt = require ('jwt-simple')
const moment = requiere('moment')

Function signup (req,res) {

	const user = new user ({
		email: req.body.email,
		displayname: req.body.displayname
		})
	user.save ((err) => {

		if (err) res.status(500).send ({message: 'Error al crear el ususario': ${err}´})

		return res.status(200).send ({token: service.createtoken(user)})	
	})
}


//Create Autorizathion///

Function singin(req,res){

user.find({emil: req.body.email}, err, user) => {
		if(err) return res.status(500).send({message: err})
		ir (!user) return res.status(404).send({message: 'No existe el Usuario'})	

req.user = user
res.status(200).send({message:'te has logeado correctamente', token: service.createtoken(user)})

})

}


funciton createtoken (user) {
const payload = {
	
	sub: user._id,
	iat: moment().unix(),
	exp: moment().add(14, 'days').unix(),

}	

jwt.encode(payload,'mipruebadeingreso')
}


/// Create Payment///
var request = new paymentrequest (

		methodData, // required metho data
		datails, //required information about transaction
		options	 // optional parameterfor things like shipping,

	)

var methodData = [{

		supportedMethods: ["VIsa","mastercard"]	
}]

var details = {

	displayItems: [
		{
			label: "Origin Amount",
			amount : {currency : "USD", value : "10"},
		},
		{
			label: "Friends andfamily discount",
			amount:{currency: "USD", value : "-1"},
			pending: true 
		}
	],

	total:{

		label: "Total",
		amount:{currency: "USD",value :"9"}
	}
}

request.show().then(function(paymentResponse) {

  // Process paymentResponse here
  paymentResponse.complete("success");
}).catch(function(err) {
  console.error("Uh oh, something bad happened", err.message)


//Create Capture//////

  {
  "reconciliation_id": "string",
  "amount": 0,
  "level_2_3": {
    "order_id": null,
    "tax_mode": "not_included",
    "tax_amount": 0,
    "shipping_amount": 0,
    "from_shipping_zip_code": "string",
    "duty_amount": 0,
    "discount_amount": 0,
    "line_items": [
      {
        "name": "string",
        "id": "string",
        "quantity": 0,
        "unit_price": 0,
        "commodity_code": "string",
        "unit_of_measure": "count",
        "tax_mode": "not_included",
        "tax_amount": 0,
        "tax_percentage": 0,
        "discount_amount": 0,
        "discount_percentage": 0,
        "sub_total": 0
      }
    ],
    "shipping_address": {
      "country": "USA",
      "state": "TX",
      "city": "Greenville",
      "line1": "10705 Old Mill Rd",
      "line2": "11605 Young Mill Rd",
      "zip_code": "75402-3435",
      "title": "Dr.",
      "first_name": "John",
      "last_name": "Travolta",
      "phone": 13301303330,
      "email": "john.travolta@johntravolta.com"
    }
  },
  "provider_specific_data": {
    "property1": {},
    "property2": {}
  },
  "additional_details": {
    "property1": "The details you specify",
    "property2": "The details you specify"
  },
  "addendums": {
    "airline_passenger_itinerary": {
      "pnr": "string",
      "passenger_name": "string",
      "passenger_phone": "string",
      "passenger_email": "string",
      "passenger_date_of_birth": "20181225",
      "airline_code": 1,
      "number_of_passengers": 0,
      "ticket_number": "001-1246781231",
      "airline_name": "American Airlines Inc.",
      "airline_designator_code": "AA",
      "restricted_ticket": true,
      "ticket_issue_date": "20181225",
      "reservation_code": "string",
      "frequent_flyer": true,
      "days_to_departure": 0,
      "round_trip": true,
      "payer_travelling": true,
      "computerized_reservation_system": "string",
      "legs": [
        {
          "leg_id": "AAA-BBB",
          "departure_airport_code": "AMS",
          "departure_date": "20181225",
          "departure_city": "string",
          "departure_country": "USA",
          "destination_country": "USA",
          "destination_city": "string",
          "arrival_date": "20181225",
          "flight_number": "string",
          "carrier_code": "AA",
          "fare_basis_code": "string",
          "fare_class": "F",
          "stopover_code": "string",
          "destination_airport_code": "AMS"
        }
      ]
    }
  }
}

///create Refund////
{
  "reembolso" : {
    "moneda" : "USD",
    "notificar" : verdadero,
    "nota" : "tamaño incorrecto",
    "envío" : {
      "full_refund" : verdadero
    },
    "refund_line_items" : [
      {
        "line_item_id" : 518995019,
        "cantidad" : 1,
        "restock_type" : "retorno",
        "location_id" : 487838322
      }
    ],
    "transacciones" : [
      {
        "parent_id" : 801038806,
        "cantidad" : 41,94,
        "kind" : "reembolso",
        "puerta de enlace" : "falso"
      }
    ]
  }
}
