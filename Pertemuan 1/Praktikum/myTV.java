public class myTV {
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public myTV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int newChannel){
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
        else {
            System.out.println(" ----- Channel Not Found ----- ");
        }
    }
    
    public void setVolume(int newVolumeLevel){
            volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        channel++;
    }
    
    public void channelDown(){
        channel--;
    }
    
    public void volumeUp(){
        volumeLevel++;
    }
    
     public void volumeDown(){
        volumeLevel--;
    }

  
}
