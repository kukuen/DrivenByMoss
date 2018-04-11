// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2018
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.configuration;

/**
 * An interface to a setting.
 *
 * @param <T> The type of the settings value
 * 
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface ISetting<T>
{
    /**
     * Add an observer for a change of the value.
     *
     * @param observer The observer
     */
    void addValueObserver (IValueObserver<T> observer);


    /**
     * Set the value of the setting.
     *
     * @param value The value
     */
    void set (T value);


    /**
     * Dis-/enable the setting.
     *
     * @param enable True to enable
     */
    void setEnabled (final boolean enable);
}
