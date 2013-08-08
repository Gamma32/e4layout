package de.duckout.e4layout.ui;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class View {
	
	@Inject
	public View(Composite parent) {
		
		//This is our main composite, actually we could use parent instead
		Composite mainComposite = new Composite(parent, SWT.NONE);
		
		//This following gridlayout ("mainGridLayout") makes 4 Columns with equal width
		//In general gridlayout uses table form to define the layout
		GridLayout mainGridLayout = new GridLayout(4, true);
		mainComposite.setLayout(mainGridLayout);
		
		//Row 1, Column 1
		Label labelClickButton = new Label(mainComposite, SWT.NONE);
		labelClickButton.setText("Click button label");
		
		//Row 1, Column 2
		Button buttonClick = new Button(mainComposite, SWT.PUSH); //Push button
		buttonClick.setText("Click me");
		
		//Row 1, Column 3
		Label labelCheckBox = new Label(mainComposite, SWT.NONE);
		labelCheckBox.setText("Checkbox label");
		
		//Row 1, Column 4
		Button buttonCheck = new Button(mainComposite, SWT.CHECK); //Checkbox
		buttonCheck.setText("Check me");
		
		//Because we defined 4 columns within the "mainGridLayout" here starts the next row
		//Row 2, Column 1 - 4 (=> because of the following "gridDataText")
		Text text = new Text(mainComposite, SWT.MULTI | SWT.WRAP | SWT.BORDER);
		text.setText("Hello Duckout");
		
		//gridDataText: takes the whole horizontal space and goes along all 4 columns
		//Also takes the whole vertical space which is available
		GridData gridDataText = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		text.setLayoutData(gridDataText);
		
		//Row 3, Column 1 - 4 (=> because of the following "gridDataFillLayout")
		//New composite for the bottom, with Filllayout
		Composite fillLayoutComposite = new Composite(mainComposite, SWT.NONE);
		
		//Again a GridData object to make the new bottomComposite alonge through all 4 columns of its parent composite
		GridData gridDataFillLayout = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		fillLayoutComposite.setLayoutData(gridDataFillLayout);
		
		//FillLayout with horizontal alignment
		//Widgets used with FillLayout are one after the other with the same size
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayoutComposite.setLayout(fillLayout);
		
		//Trie to make some dummy texts
		Text fillLayoutText = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText.setText("I");
		Text fillLayoutText2 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText2.setText("hope");
		Text fillLayoutText3 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText3.setText("this");
		Text fillLayoutText4 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText4.setText("example");
		Text fillLayoutText5 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText5.setText("helps");
		Text fillLayoutText6 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText6.setText("you!");
		
		//Row 4, Column 1 - 4 (=> because of the following "gridDataBottom")
		//A new area for a SashForm
		Composite bottomComposite = new Composite(mainComposite, SWT.NONE);
		
		//GridData with one column
		GridLayout gridLayoutBottom = new GridLayout(1, true);
		bottomComposite.setLayout(gridLayoutBottom);
		
		//Again the GridData to make it through all columns of the parent
		GridData gridDataBottom = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		bottomComposite.setLayoutData(gridDataBottom);
		
		//Create a sashForm
		SashForm sashForm = new SashForm(bottomComposite, SWT.HORIZONTAL);

		//Make the shashForm fill the horizontal and vertical alignment
		GridData sashFormGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		sashForm.setLayoutData(sashFormGridData);
		
		Text textLeft = new Text(sashForm, SWT.BORDER);
		textLeft.setText("Left side");
		
		Text textRight = new Text(sashForm, SWT.BORDER);
		textRight.setText("Right side");
		
	}
}
