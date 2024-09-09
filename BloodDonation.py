def canGiveBlood(Donor, Receiver):
    compatibility = {
            "A+": ["A+", "B+", "O+", "AB+"],
            "A-": ["A", "AB-", "AB+"],
            "B+": ["A+", "B+", "O+", "AB+"],
            "B-": ["B", "AB-", "AB+"],
            "AB-": ["AB-", "AB+"],
            "AB+" : ["AB+"],
            "O+": ["A+", "B+", "O+", "AB+"],
            "O-": ["A+", "B+", "O+", "AB+", "A-", "B-", "AB-"]
    }

    return Receiver.upper() in compatibility[Donor.upper()]


Donor = str(input("Donor: "))
Receiver = str(input("Receiver: "))

print(canGiveBlood(Donor, Receiver))