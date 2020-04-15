package de.mpicbg.ulman.fusion;

import net.imagej.ImageJ;

public class testPluginGTviaMarkers
{
	public static void main(final String... args)
	{
		//start up our own Fiji/Imagej2
		final ImageJ ij = new net.imagej.ImageJ();
		ij.ui().showUI();

		//run this class as if from GUI
		ij.command().run(plugin_GTviaMarkers.class, true);
	}
}
