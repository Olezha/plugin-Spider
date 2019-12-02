package plugins.Spider.web;

import freenet.support.HTMLNode;
import freenet.support.api.HTTPRequest;

/**
 * Interface for all web pages
 * 
 * @author j16sdiz (1024D/75494252)
 */
interface WebPage {

	void processPostRequest(HTTPRequest request, HTMLNode contentNode);

	void writeContent(HTTPRequest request, HTMLNode contentNode);

}