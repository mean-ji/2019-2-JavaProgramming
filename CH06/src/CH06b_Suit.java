

	enum Suit{
		MON ("red"), TUE ("orange"), WED ("yellow"),THU ("green"),FRI("blue"),SAT("indigo"),SUN("purple");
		private final String color;
		private Suit (String suitColor){
			color = suitColor;
		}
		public String getColor () {return color;}
	}


