abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }
    double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2)
            charge += (daysRented - 2) * 1.5;
        return charge;
    }
}

class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
    double getCharge(int daysRented) {
        double charge = 1.5;
        if (daysRented > 3)
            charge += (daysRented - 3) * 1.5;
        return charge;
    }
}

class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
