INPUT


{
	"empid":"DBBRO1",
	"name_of_stock":"MARUTI",
	"broker_price":9100
}


Output
{

    Correct Response
    {
        {
            "code": 1,
            "title": "Compliance Verification",
            "description": "Compliance Verified Set Price is within limits",
            "data": null
        }


    }

    When price is more than 2%
        {
            "code": 2,
            "title": "Compliance Verification",
            "description": "Price is non-compliance it should be within 2% limit of market price",
            "data": "613.1370239257812:638.1630249023438"
        }

    Query fail Wrong company name etc
    {

        {
            "code": 3,
            "title": "Compliance Verification",
            "description": "Query Error",
            "data": null
        }

     }

}


The time has been hardcoded for now.
Will be implemented from system later.

