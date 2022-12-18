package Auto;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    String zero = "«Информация не указана»";

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){this.brand = zero;
        }else this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()){this.model = zero;
        }else this.model = model;
        this.year = Math.max(year,1986);
        if (color == null || color.isEmpty() || color.isBlank()){this.color = zero;
        }else this.color = color;
        if (country == null || country.isEmpty() || country.isBlank()) {this.country = zero;
        }else this.country = country;
        this.maxSpeed = Math.max(maxSpeed,90.0);
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public int getYear() {return year;}

    public String getCountry() {return country;}

    public String getColor() {return color;}

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
        this.color = zero;
    } else this.color = color;}

    public void setMaxSpeed(double maxSpeed) {
            this.maxSpeed = Math.max(maxSpeed,90.0);
        }
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", "+ getYear() + " года выпуска, производство " + getCountry() +
                ", цвет: " + getColor() + ", максимальная скорость: " + getMaxSpeed() + " км/ч.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) {
                return true;
            }
            Bus bus = (Bus) obj;
            return brand.equals(((Transport) obj).brand) && model.equals(((Transport) obj).model) &&
                    year == ((Transport) obj).year && country.equals(((Transport) obj).country) &&
                    color.equals(((Transport) obj).color) && maxSpeed == ((Transport) obj).maxSpeed;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(brand, model, year, country, color, maxSpeed);
    }
}
