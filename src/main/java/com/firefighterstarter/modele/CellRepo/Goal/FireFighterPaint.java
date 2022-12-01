package com.firefighterstarter.modele.CellRepo.Goal;

import com.firefighterstarter.modele.CellRepo.Cell;

public class FireFighterPaint extends Cell {
    private int position;
    private Cell fireGoal;
    private int distance;

    public FireFighterPaint() {

    }

    public ColorType getColor() {
        return ColorType.FIREFIGHTER;
    }





    /*public void mouveFireFighter() {
        List<FireFighter> update = new ArrayList<>();
        for(FireFighter fireFighter : this.listOfFireFighters) {
            for(int ditance = 1; ditance <= 2; ditance++) {
                getFireInDistance(fireFighter, ditance);
            }
            if(fireFighter.getFires().size() != 0) {
                this.listOfCells.get(fireFighter.getFires().get(0)).setColorType(ColorType.FIREFIGHTER);
                this.listOfCells.get(fireFighter.getPosition()).setColorType(ColorType.NOTHING);
                update.add(new FireFighter(fireFighter.getFires().get(0)));
            } else {
                update.add(fireFighter);
            }
        }
        //deleteAllFireFromFireFighter(update);
        this.listOfFireFighters = deleteAllFireFromFireFighter(update);
    }

    private void getFireInDistance(FireFighter fireFighter, int distance) {
        try {
            if(onTheLeftPart(fireFighter.getPosition() + distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);
            }

            if(onTheLeftPart(fireFighter.getPosition() - distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);
            }

            if(onTheLeftPart(fireFighter.getPosition() + distance + 33)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance+ 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance + 33);
            }

            if(onTheRightPart(fireFighter.getPosition() + distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);
            }

            if(onTheRightPart(fireFighter.getPosition() - distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);
            }

            if(onTheRightPart(fireFighter.getPosition() - distance - 33)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance - 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance - 33);
            }

            else {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);

                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);

                if(this.listOfCells.get(fireFighter.getPosition() + distance + 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance + 33);

                if(this.listOfCells.get(fireFighter.getPosition() - distance -33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance -33);
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error for fireFighter : " + fireFighter.getPosition() + " for distance : " + distance);
        }


    }



    private boolean onTheRightPart(int number) {
        return number >= 1419 && number <= 1452;
    }

    private boolean onTheLeftPart(int number) {
        return number >= 0 && number <= 32;
    }






    private List<FireFighter> deleteAllFireFromFireFighter(List<FireFighter> list) {
        for(FireFighter fireFighter : list)
            fireFighter.removeAllFires();
        return list;
    }
*/

}
